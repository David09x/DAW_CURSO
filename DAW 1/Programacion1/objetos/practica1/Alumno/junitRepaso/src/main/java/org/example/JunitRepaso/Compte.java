package org.example.JunitRepaso;

import org.example.exceptions.saldoNegatiu;

import java.math.BigDecimal;

public class Compte {
    private String persona;
    private BigDecimal saldo;
    private Banc banc;
    private String IBAN;

    public Compte(String persona, BigDecimal saldo) {
        this.persona = persona;
        this.saldo = saldo;
    }

    public Compte(String persona, BigDecimal saldo, String IBAN) {
        this.persona = persona;
        this.saldo = saldo;
        this.IBAN = IBAN;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public Compte(BigDecimal bigDecimal) {
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public Banc getBanc() {
        return banc;
    }

    public void setBanc(Banc banc) {
        this.banc = banc;
    }

    public void carrec(BigDecimal valor) {
        BigDecimal saldoaux = saldo.subtract(valor);
        if(saldoaux.compareTo(BigDecimal.ZERO)<0){
            throw new saldoNegatiu("Saldo negatiu");
        }
        this.saldo = saldoaux;
    }

    public void abonament(BigDecimal valor){
        this.saldo = saldo.add(valor);
    }
    @Override
    public boolean equals(Object obj){

        if(!(obj instanceof Compte)){
            return false;
        }
        Compte c = (Compte) obj;
        if(this.persona ==  null || this.saldo == null){
            return false;
        }
        return this.persona.equals(c.getPersona()) && this.saldo.equals(c.getSaldo());
    }

}

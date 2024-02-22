<?php

class Empresa
{
    private $NIF;
    private $nom;
    private $domicili;
    private $cpostal;
    private $poblacio;
    private $telefono;
    private $email;
    private $idsector;

    /**
     * @return mixed
     */
    public function getNif()
    {
        return $this->NIF;
    }

    /**
     * @param mixed $nif
     */
    public function setNif($nif): void
    {
        $this->NIF = $nif;
    }

    /**
     * @return mixed
     */
    public function getNom()
    {
        return $this->nom;
    }

    /**
     * @param mixed $nom
     */
    public function setNom($nom): void
    {
        $this->nom = $nom;
    }

    /**
     * @return mixed
     */
    public function getDomicili()
    {
        return $this->domicili;
    }

    /**
     * @param mixed $domicili
     */
    public function setDomicili($domicili): void
    {
        $this->domicili = $domicili;
    }

    /**
     * @return mixed
     */
    public function getCpostal()
    {
        return $this->cpostal;
    }

    /**
     * @param mixed $cpostal
     */
    public function setCpostal($cpostal): void
    {
        $this->cpostal = $cpostal;
    }

    /**
     * @return mixed
     */
    public function getPoblacio()
    {
        return $this->poblacio;
    }

    /**
     * @param mixed $poblacio
     */
    public function setPoblacio($poblacio): void
    {
        $this->poblacio = $poblacio;
    }

    /**
     * @return mixed
     */
    public function getTelefono()
    {
        return $this->telefono;
    }

    /**
     * @param mixed $telefono
     */
    public function setTelefono($telefono): void
    {
        $this->telefono = $telefono;
    }

    /**
     * @return mixed
     */
    public function getEmail()
    {
        return $this->email;
    }

    /**
     * @param mixed $email
     */
    public function setEmail($email): void
    {
        $this->email = $email;
    }

    /**
     * @return mixed
     */
    public function getIdsector()
    {
        return $this->idsector;
    }

    /**
     * @param mixed $idsector
     */
    public function setIdsector($idsector): void
    {
        $this->idsector = $idsector;
    }



}

class sector
{
    private $idsector;
    private $nomsector;

    /**
     * @return mixed
     */
    public function getIdSector()
    {
        return $this->idsector;
    }

    /**
     * @param mixed $idSector
     */
    public function setIdSector($idSector): void
    {
        $this->idsector = $idSector;
    }

    /**
     * @return mixed
     */
    public function getNomSector()
    {
        return $this->nomsector;
    }

    /**
     * @param mixed $nomSector
     */
    public function setNomSector($nomSector): void
    {
        $this->nomsector = $nomSector;
    }

}


class DB
{
    static function connect()
    {
        try {
            $pdo = new PDO(
                "mysql:host=localhost;dbname=ejercicioEntrega",
                'admin',
                'php',
                array(PDO::ATTR_PERSISTENT => true)
            );
            $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
            $pdo->exec("SET NAMES 'utf8'");
        } catch (PDOException $e) {
            return null;
        }
        return $pdo;
    }
}

class ContacteDB
{
    static public function getAll()
    {
        try {
            $pdo = DB::connect();
            if ($pdo == null)
                return null;
            $sql = "SELECT * FROM sector";
            $stmt = $pdo->prepare($sql);
            $stmt->setFetchMode(PDO::FETCH_CLASS | PDO::FETCH_PROPS_LATE, "sector");
            $stmt->execute();
            $result = $stmt->fetchAll();
            return $result;
        } catch (Throwable $e) {
            echo "Error " . $e->getMessage();
        }
    }

    static public function getAllEmpresa()
    {
        try {
            $pdo = DB::connect();
            if ($pdo == null)
                return null;
            $sql = "SELECT * FROM empresa";
            $stmt = $pdo->prepare($sql);
            $stmt->setFetchMode(PDO::FETCH_CLASS | PDO::FETCH_PROPS_LATE, "Empresa");
            $stmt->execute();
            $result = $stmt->fetchAll();
            return $result;
        } catch (Throwable $e) {
            echo "Error " . $e->getMessage();
        }
    }
    static public function insertSector($sector)
    {
        try {
            $pdo = DB::connect();
            if ($pdo == null)
                return array('code' => 0, 'message' => 'NO database connection');
            $sql = "INSERT INTO  sector VALUES(NULL,:n)";
            $stmt = $pdo->prepare($sql);
            $stmt->execute([
                'n' => $sector->getNomSector(),
            ]);
            $result = $stmt->rowCount();
            return array('code' => 1, 'message' => "$result contacts added succesfully");
        } catch (Throwable $e) {
            return array('code' => 0, 'message' => "Error" . $e->getMessage());
        }
    }

    static public function insertEmpresa($empresa)
    {
        try {
            $pdo = DB::connect();
            if ($pdo == null)
                return array('code' => 0, 'message' => 'NO database connection');
            $sql = "INSERT INTO  empresa VALUES(:nif,:n,:d,:c,:p,:t,:e,:i)";
            $stmt = $pdo->prepare($sql);
            $stmt->execute([
                'nif' => $empresa->getNif(),
                'n' => $empresa->getNom(),
                'd' => $empresa->getDomicili(),
                'c' => $empresa->getCpostal(),
                'p' => $empresa->getPoblacio(),
                't' => $empresa->getTelefono(),
                'e' => $empresa->getEmail(),
                'i' => $empresa->getIdsector(),
            ]);
            $result = $stmt->rowCount();
            return array('code' => 1, 'message' => "$result contacts added succesfully");
        } catch (Throwable $e) {
            return array('code' => 0, 'message' => "Error" . $e->getMessage());
        }
    }

    static public function deletedSector($id)
    {
        try {
            $pdo = DB::connect();
            if ($pdo == null)
                return array('code' => 0, 'message' => 'NO database connection');
            $sql = "DELETE  FROM  sector WHERE idsector= :id";
            $stmt = $pdo->prepare($sql);
            $stmt->execute(['id' => $id]);
            $result = $stmt->rowCount();
            return array('code' => 1, 'message' => "$result contacts deteled succesfully");
        } catch (Throwable $e) {
            return array('code' => 0, 'message' => "Error" . $e->getMessage());
        }
    }

    static public function deletedEmpresa($nif)
    {
        try {
            $pdo = DB::connect();
            if ($pdo == null)
                return array('code' => 0, 'message' => 'NO database connection');
            $sql = "DELETE  FROM  empresa WHERE NIF= :nif";
            $stmt = $pdo->prepare($sql);
            $stmt->execute(['nif' => $nif]);
            $result = $stmt->rowCount();
            return array('code' => 1, 'message' => "$result contacts deteled succesfully");
        } catch (Throwable $e) {
            return array('code' => 0, 'message' => "Error" . $e->getMessage());
        }
    }

    static public function getById($idsector)
    {
        try {
            $pdo = DB::connect();
            if ($pdo == null)
                return null;
            $sql = "SELECT * FROM sector WHERE idsector=:idsector";
            $stmt = $pdo->prepare($sql);
            $stmt->setFetchMode(PDO::FETCH_CLASS | PDO::FETCH_PROPS_LATE, "sector");
            $stmt->execute(['idsector' => $idsector]);
            $result = $stmt->fetch();
            $fila = $stmt->rowCount();
            return array('code' => 1, 'message' => "$fila contacts updated succesfully", 'sector' => $result);

        } catch (Throwable $e) {
            return array('code' => 0, 'message' => "Error" . $e->getMessage());
        }
    }

    static public function getByIdEmpresa($nifEmpresa)
    {
        try {
            $pdo = DB::connect();
            if ($pdo == null)
                return null;
            $sql = "SELECT * FROM empresa WHERE NIF=:nif";
            $stmt = $pdo->prepare($sql);
            $stmt->setFetchMode(PDO::FETCH_CLASS | PDO::FETCH_PROPS_LATE, "Empresa");
            $stmt->execute(['nif' => $nifEmpresa]);
            $result = $stmt->fetch();
            $fila = $stmt->rowCount();
            return array('code' => 1, 'message' => "$fila contacts updated succesfully", 'Empresa' => $result);

        } catch (Throwable $e) {
            return array('code' => 0, 'message' => "Error" . $e->getMessage());
        }
    }

    static public function updateEmpresa($empresa)
    {
        try {
            $pdo = DB::connect();
            if ($pdo == null)
                return array('code' => 0, 'message' => 'NO database connection');
            $sql = "UPDATE empresa SET nom=:n,domicili=:d,cpostal=:c,poblacio=:p,telefono=:t,email=:e,idSector=:i WHERE NIF=:nif";
            $stmt = $pdo->prepare($sql);
            $stmt->execute([
                'nif' => $empresa->getNif(),
                'n' => $empresa->getNom(),
                'd' => $empresa->getDomicili(),
                'c' => $empresa->getCpostal(),
                'p' => $empresa->getPoblacio(),
                't' => $empresa->getTelefono(),
                'e' => $empresa->getEmail(),
                'i' => $empresa->getIdsector(),
            ]);
            $result = $stmt->rowCount();
            return array('code' => 1, 'message' => "$result contacts added succesfully");
        } catch (Throwable $e) {
            return array('code' => 0, 'message' => "Error" . $e->getMessage());
        }
    }

    static public function updateSector($sector)
    {
        try {
            $pdo = DB::connect();
            if ($pdo == null)
                return array('code' => 0, 'message' => 'NO database connection');
            $sql = "UPDATE sector SET nomsector=:n WHERE idsector=:i";
            $stmt = $pdo->prepare($sql);
            $stmt->execute([
                'i' => $sector->getIdSector(),
                'n' => $sector->getNomSector(),
            ]);
            $result = $stmt->rowCount();
            return array('code' => 1, 'message' => "$result contacts added succesfully");
        } catch (Throwable $e) {
            return array('code' => 0, 'message' => "Error" . $e->getMessage());
        }
    }
}




?>
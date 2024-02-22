<?php
include_once ("classes.php");
interface Table {
    
    public function drawHeader();
    public function drawRows(); 
    public function drawTable(); 
}
class Tablecontents implements Table {
	private $title; // titol del llistat
	private $titles; // titols de les columnes
	private $contactes; // llista de clients
	

	/**
	 * @return mixed
	 */
	public function getTitle() {
		return $this->title;
	}
	
	/**
	 * @param mixed $title 
	 * @return self
	 */
	public function setTitle($title): self {
		$this->title = $title;
		return $this;
	}

	/**
	 * @return mixed
	 */
	public function getTitles() {
		return $this->titles;
	}
	
	/**
	 * @param mixed $titles 
	 * @return self
	 */
	public function setTitles($titles): self {
		$this->titles = $titles;
		return $this;
	}

	/**
	 * @return mixed
	 */
	public function getContactes() {
		return $this->contactes;
	}
	
	/**
	 * @param mixed $contactes 
	 * @return self
	 */
	public function setContactes($contactes): self {
		$this->contactes = $contactes;
		return $this;
	}
	public function drawHeader() {
		echo "<h3>$this->title</h3>";
		echo "<table>";
		echo "<tr>";
		foreach($this->titles as $columna) {
			echo "<th>$columna</th>";

		}
		echo "</tr>";
	}
    public function drawRows() {

        foreach ($this->contactes as $trabajadores){

            $trabajadores = unserialize($trabajadores);
            echo "<tr>";
            echo "<td>".$trabajadores->getName()."</td>";
            echo "<td>".$trabajadores->getSurname()."</td>";
            if($trabajadores instanceof nomina){
                echo "<td>".$trabajadores->nominaWorkers()."</td>";
                echo "</tr>";
            }else if($trabajadores instanceof comission){
                echo "<td>".$trabajadores->comissionWorkers()."</td>";
                echo "</tr>";
            }

        }

	} 
    public function drawTable() {
		$this->drawHeader();
		$this->drawRows();
		echo "</table>";
	}
}

class treballador {
    private $name;
    private $surname;

    /**
     * @return mixed
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * @param mixed $name
     */
    public function setName($name): void
    {
        $this->name = $name;
    }

    /**
     * @return mixed
     */
    public function getSurname()
    {
        return $this->surname;
    }

    /**
     * @param mixed $surname
     */
    public function setSurname($surname): void
    {
        $this->surname = $surname;
    }

}
class nomina extends treballador {

    private $salary;
    private $payments;

    /**
     * @return mixed
     */
    public function getSalary()
    {
        return $this->salary;
    }

    /**
     * @param mixed $salary
     */
    public function setSalary($salary): void
    {
        $this->salary = $salary;
    }

    /**
     * @return mixed
     */
    public function getPayments()
    {
        return $this->payments;
    }

    /**
     * @param mixed $payments
     */
    public function setPayments($payments): void
    {
        $this->payments = $payments;
    }

    public function nominaWorkers(){
        return $this->payments * $this->salary;

    }

}

class comission extends treballador{
    private $sales;
    private $percent;

    /**
     * @return mixed
     */
    public function getSales()
    {
        return $this->sales;
    }

    /**
     * @param mixed $sales
     */
    public function setSales($sales): void
    {
        $this->sales = $sales;
    }

    /**
     * @return mixed
     */
    public function getPercent()
    {
        return $this->percent;
    }

    /**
     * @param mixed $percent
     */
    public function setPercent($percent): void
    {
        $this->percent = $percent;
    }

    public function comissionWorkers(){
        return ($this->sales * $this->percent)/100;
    }

}
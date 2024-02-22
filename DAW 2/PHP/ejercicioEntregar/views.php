<?php
require_once("models.php");

interface Table
{

	public function drawHeader();
	public function drawRows();
	public function drawTable();
}

class tableContent implements Table
{

	private $title; // titol del llistat
	private $titles; // titols de les columnes
	private $empresa;

	public function getTitle()
	{
		return $this->title;
	}

	public function setTitle($title): self
	{
		$this->title = $title;
		return $this;
	}

	/**
	 * @return mixed
	 */
	public function getTitles()
	{
		return $this->titles;
	}

	/**
	 * @param mixed $titles 
	 * @return self
	 */
	public function setTitles($titles): self
	{
		$this->titles = $titles;
		return $this;
	}

	public function setEmpresa($empresa):self{
		$this->empresa = $empresa;
		return $this;
	}

	public function getEmpresa()
	{
		return $this->empresa;
	}

	public function drawHeader()
	{
		
		echo "<table class='table table-sm caption-top'>";
        echo "<caption class='text-center m-2 p-1 bg-' style='background-color: rgba(0, 0, 0, 0.15);'>$this->title</caption>";
		echo "<table class='table table-sm'>";
		echo "<tr>";
		foreach($this->titles as $columna) {
			echo "<th>$columna</th>";
		}
		echo "</tr>";
	}

	public function drawRows(){
	
		foreach($this->empresa as $emp) {
			echo "<tr>";
			echo "<td>".$emp->getNif()."</td>";
			echo "<td>".$emp->getNom()."</td>";
			echo "<td>".$emp->getDomicili()."</td>";
			echo "<td>".$emp->getCpostal()."</td>";
			echo "<td>".$emp->getPoblacio()."</td>";
			echo "<td>".$emp->getTelefono()."</td>";
			echo "<td>".$emp->getEmail()."</td>";
			echo "<td>".$emp->getIdsector()."</td>";
			$nif= $emp->getNif();
			echo "<td><a class='btn btn-danger btn-sm' href='deleteRowEmpresa.php?id=$nif'>Delete</a> <a class='btn btn-warning btn-sm' href='tablesEmpresa.php?id=$nif'>Update</a></td>";
			echo "</tr>";
		}
	}
	public function drawTable()
	{
		$this->drawHeader();
		$this->drawRows();
		echo "</table>";
	}
}
?>
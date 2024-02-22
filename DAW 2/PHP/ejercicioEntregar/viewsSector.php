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
	private $sectoresG;

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

	public function setSectorG($sector):self{
		$this->sectoresG = $sector;
		return $this;
	}

	public function getSectorG()
	{
		return $this->sectoresG;
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
	
		foreach($this->sectoresG as $sector) {
			echo "<tr>";
			echo "<td>".$sector->getIdSector()."</td>";
			echo "<td>".$sector->getNomSector()."</td>";
			$id= $sector->getIdSector();
			echo "<td><a class='btn btn-danger btn-sm' href='deleteRow.php?id=$id'>Delete</a> <a class='btn btn-warning btn-sm' href='tables.php?id=$id'>Update</a></td>";
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
<?php
class Contacte
{
	private $id;
	private $name;
	private $surname;
	private $email;
	private $phone;


	/**
	 * @return mixed
	 */
	public function getId()
	{
		return $this->id;
	}

	/**
	 * @param mixed $id 
	 * @return self
	 */
	public function setId($id): self
	{
		$this->id = $id;
		return $this;
	}

	/**
	 * @return mixed
	 */
	public function getName()
	{
		return $this->name;
	}

	/**
	 * @param mixed $name 
	 * @return self
	 */
	public function setName($name): self
	{
		$this->name = $name;
		return $this;
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
	 * @return self
	 */
	public function setSurname($surname): self
	{
		$this->surname = $surname;
		return $this;
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
	 * @return self
	 */
	public function setEmail($email): self
	{
		$this->email = $email;
		return $this;
	}

	/**
	 * @return mixed
	 */
	public function getPhone()
	{
		return $this->phone;
	}

	/**
	 * @param mixed $phone 
	 * @return self
	 */
	public function setPhone($phone): self
	{
		$this->phone = $phone;
		return $this;
	}

	public function toArray()
	{
		return array("id" => $this->id, "name" => $this->name, "surname" => $this->surname, "email" => $this->email, "phone" => $this->phone);
	}
}

class DB
{
	static function connect()
	{
		try {
			$pdo = new PDO(
				"mysql:host=localhost;dbname=proves",
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
				return array('code' => 0, 'message' => "No database connection");
			$sql = "SELECT * FROM contact";
			$stmt = $pdo->prepare($sql);
			$stmt->setFetchMode(PDO::FETCH_CLASS | PDO::FETCH_PROPS_LATE, "Contacte");
			$stmt->execute();
			$result = $stmt->fetchAll();
			return array('code' => 1, 'result' => $result, 'message' => "database connected");
		} catch (Throwable $e) {
			return array('code' => 0, 'message' => "Error " . $e->getMessage());
		}
	}
	static public function insert($contacte)
	{
		try {
			$pdo = DB::connect();
			if ($pdo == null)
				return array('code' => 0, 'message' => "No database connection");
			$sql = "INSERT INTO contact VALUES(NULL,:n,:s,:e,:p)";
			$stmt = $pdo->prepare($sql);
			$stmt->execute([
				'n' => $contacte->getName(),
				's' => $contacte->getSurname(),
				'e' => $contacte->getEmail(),
				'p' => $contacte->getPhone()
			]);
			$result = $stmt->rowCount();
			return array('code' => 1, 'message' => "$result contatcs added succesfully");
		} catch (Throwable $e) {
			return array('code' => 0, 'message' => "Error " . $e->getMessage());
		}
	}
	static public function delete($id)
	{
		try {
			$pdo = DB::connect();
			if ($pdo == null)
				return array('code' => 0, 'message' => "No database connection");
			$sql = "DELETE FROM contact WHERE id = :id";
			$stmt = $pdo->prepare($sql);
			$stmt->execute(['id' => $id]);
			$result = $stmt->rowCount();
			return array('code' => 1, 'message' => "$result contacts succesfully removed","rows"=>$result);
		} catch (Throwable $e) {
			return array('code' => 0, 'message' => "Error " . $e->getMessage());
		}
	}

	static public function getById($id)
	{
		try {
			$pdo = DB::connect();
			if ($pdo == null)
				return array('code' => 0, 'message' => "No database connection");
			$sql = "SELECT * FROM contact WHERE id = :id";
			$stmt = $pdo->prepare($sql);
			$stmt->setFetchMode(PDO::FETCH_CLASS | PDO::FETCH_PROPS_LATE, "Contacte");
			$stmt->execute(['id' => $id]);
			$result = $stmt->fetch();
			$fil = $stmt->rowCount();
			// return $result;
			return array('code' => 1, 'message' => "$fil selected succesfully", 'contact' => $result);
		} catch (Throwable $e) {
			// echo "Error " . $e->getMessage();
			return array('code' => 0, 'message' => "Error " . $e->getMessage());
		}

	}
	static public function update($contacte)
	{
		try {
			$pdo = DB::connect();
			if ($pdo == null)
				return array('code' => 0, 'message' => "No database connection");
			$sql = "UPDATE contact SET name=:n,surname=:s,email=:e,phone=:p WHERE id = :id";
			$stmt = $pdo->prepare($sql);
			$stmt->execute([
				'n' => $contacte->getName(),
				's' => $contacte->getSurname(),
				'e' => $contacte->getEmail(),
				'p' => $contacte->getPhone(),
				'id' => $contacte->getId()
			]);
			$result = $stmt->rowCount();
			return array('code' => 1, 'message' => "$result contatcs updated succesfully");
		} catch (Throwable $e) {
			return array('code' => 0, 'message' => "Error " . $e->getMessage());
		}
	}
}
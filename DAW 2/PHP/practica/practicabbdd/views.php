<?php 
class Response {
	public static function result($code,$response) {
		header("Content-type:application/json;charset='UTF-8'");
		http_response_code($code);
		return json_encode($response);
	}
}
?>
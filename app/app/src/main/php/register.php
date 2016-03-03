<?php
if($_SERVER['REQUEST_METHOD']=='POST'){
		$lastname = $_POST['lastname'];
		$name = $_POST['name'];
		$password = $_POST['password'];
		$email = $_POST['email'];
		$yob = $_POST['yob'];
		$gender = $_POST['gender'];
		$timezone = $_POST['timezone];
		
		if($lastname == '' || $name == '' || $password == '' || $email == '' || $yob =='' || $gender =='' || $timezone == ''){
			echo 'please fill all values';
		}else{
			require_once('dbconnect.php');
			$sql = "SELECT * FROM User WHERE email='$email'";
			
			$check = mysqli_fetch_array(mysqli_query($con,$sql));
			
			if(isset($check)){
				echo 'email already exist';
			}else{				
				$sql = "INSERT INTO users (Last_Name,Name,E-Mail_Address,Password,YoB,Gender,Time_Zone) VALUES('$lastname','$name','$password','$email','$yob','$gender','$timezone')";
				if(mysqli_query($con,$sql)){
					echo 'successfully registered';
				}else{
					echo 'oops! Please try again!';
				}
			}
			mysqli_close($con);
		}
}else{
echo 'error';
}
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" >
<head>
  <meta charset="UTF-8">
  <title>CodePen - Expanding Contact Form</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">

<link href='https://fonts.googleapis.com/css?family=Roboto:400,700' rel='stylesheet' type='text/css'>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css"><link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
<link rel="stylesheet" href="./style.css">

</head>
<body>
<!-- partial:index.partial.html -->
<div class='form-overlay'></div>
<div class='icon fa fa-pencil' id='form-container'>
  <span class='icon fa fa-close' id='form-close'></span>
  <div id='form-content'>
    <div id='form-head'>
      <h1 class='pre'>Get in touch</h1>
      <p class='pre'>Good choice...</p>
      <h1 class='post'>Thanks!</h1>
      <p class='post'>I'll be in touch ASAP</p>
    </div>
    <form>
      <input class='input name' name='user_name' placeholder='Your name please' type='text'>
      <input class='input email' name='user_email' placeholder='A contact email' type='text'>
      <select class='input select' name='subject'>
        <option disabled=''>What shall we talk about?</option>
        <option selected=''>About a new project</option>
        <option>About a job opportunity</option>
        <option>Let's do this over a coffee</option>
      </select>
      <textarea class='input message' placeholder='How can I help?'></textarea>
      <input class='input submit' type='submit' value='Send Message'>
    </form>
  </div>
</div>
<!-- partial -->
  <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src='https://codepen.io/woodwoerk/pen/XXZaGQ.js'></script><script  src="./script.js"></script>

</body>
</html>

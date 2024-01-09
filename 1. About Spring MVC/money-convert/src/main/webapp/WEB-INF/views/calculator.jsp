<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Simple Calculator</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            margin: 100px;
        }

        #calculator {
            width: 300px;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        input {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            box-sizing: border-box;
        }

        button {
            width: 48%;
            padding: 10px;
            margin: 5px;
            box-sizing: border-box;
            cursor: pointer;
            font-size: 16px;
        }
    </style>
</head>
<body>

<div id="calculator">
    <form action="<%= request.getContextPath() %>/calculator" method="post">
        <input type="text" id="display" name="expression" value="${expression}" readonly>

        <button type="button" onclick="appendToDisplay('1')">1</button>
        <button type="button" onclick="appendToDisplay('2')">2</button>
        <button type="button" onclick="appendToDisplay('+')">+</button>
        <button type="submit">=</button>

        <button type="button" onclick="appendToDisplay('3')">3</button>
        <button type="button" onclick="appendToDisplay('4')">4</button>
        <button type="button" onclick="appendToDisplay('-')">-</button>
        <button type="button" onclick="clearDisplay()">C</button>

        <button type="button" onclick="appendToDisplay('5')">5</button>
        <button type="button" onclick="appendToDisplay('6')">6</button>
        <button type="button" onclick="appendToDisplay('*')">*</button>
        <button type="button" onclick="backspace()">←</button>

        <button type="button" onclick="appendToDisplay('7')">7</button>
        <button type="button" onclick="appendToDisplay('8')">8</button>
        <button type="button" onclick="appendToDisplay('/')">/</button>
        <button type="button" onclick="clearDisplay()">C</button>

        <button type="button" onclick="appendToDisplay('9')">9</button>
        <button type="button" onclick="appendToDisplay('0')">0</button>
        <button type="button" onclick="appendToDisplay('.')">.</button>
    </form>
</div>

<script>
    function appendToDisplay(value) {
        document.getElementById('display').value += value;
    }

    function clearDisplay() {
        document.getElementById('display').value = '';
    }

    function backspace() {
        let currentDisplay = document.getElementById('display').value;
        document.getElementById('display').value = currentDisplay.slice(0, -1);
    }
</script>   
</body>
</html>

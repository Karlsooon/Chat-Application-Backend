const input1 = document.getElementById("input1");
const input2 = document.getElementById("input2");
const plus = document.getElementById("plus");
const minus = document.getElementById("minus");
const submit = document.getElementById("submit");
const resultElement = document.getElementById("result");

let action = "+";

plus.onclick = function () {
  action = "+";
};
minus.onclick = function () {
  action = "-";
};

function computeumberWithction(input1, input2, action) {
  const num1 = Number(input1.value);
  const num2 = Number(input2.value);
  return action == "+" ? num1 + num2 : num1 - num2;
}

function printResult(result) {
  if (result < 0) {
    resultElement.style.color = "red";
  } else {
    resultElement.style.color = "green";
  }
  resultElement.textContent = result;
}

submit.onclick = function () {
  const result = computeumberWithction(input1, input2, action);
  printResult(result);
};

document.getElementById("registrationForm").addEventListener("submit", function (e) {
  e.preventDefault();

  const fullname = document.getElementById("fullname").value.trim();
  const username = document.getElementById("username").value.trim();
  const email = document.getElementById("email").value.trim();
  const phone = document.getElementById("phone").value.trim();
  const gender = document.getElementById("gender").value;
  const password = document.getElementById("password").value;
  const confirmPassword = document.getElementById("confirmPassword").value;
  const message = document.getElementById("message");

  // Clear previous message
  message.textContent = "";
  message.style.color = "red";

  if (fullname.length < 3) {
    message.textContent = "Full name must be at least 3 characters.";
    return;
  }

  if (username.length < 4) {
    message.textContent = "Username must be at least 4 characters.";
    return;
  }

  if (!email.includes("@") || !email.includes(".")) {
    message.textContent = "Enter a valid email.";
    return;
  }

  if (!/^\d{10}$/.test(phone)) {
    message.textContent = "Phone number must be 10 digits.";
    return;
  }

  if (gender === "") {
    message.textContent = "Please select a gender.";
    return;
  }

  if (password.length < 6) {
    message.textContent = "Password must be at least 6 characters.";
    return;
  }

  if (password !== confirmPassword) {
    message.textContent = "Passwords do not match.";
    return;
  }

  // If all validation passes
  message.style.color = "green";
  message.textContent = "Registration successful!";
  
  // You can send data to server or reset form
  // e.target.reset();
});

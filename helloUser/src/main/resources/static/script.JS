

// localStorage för att spara Admin

let adminUsername = document.getElementById("adminUsername");
let adminPassword = document.getElementById("adminPassword")
let adminBtn = document.getElementById("adminBtn")

adminBtn.addEventListener("click", () => {
    console.log(adminUsername.value + " " + adminPassword.value)
})


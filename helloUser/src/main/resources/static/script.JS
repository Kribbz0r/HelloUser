let adminUsername = document.getElementById("adminUsername");
let adminPassword = document.getElementById("adminPassword");
let adminRights = document.getElementsByClassName("adminRights");
let adminRightsElements = Array.from(adminRights);



document.getElementById("adminBtn").addEventListener("click", (e) => {
    let adminInput = document.getElementById("adminUsername").value + document.getElementById("adminPassword").value;
    localStorage.setItem("adminInput", adminInput)
    console.log(adminInput);
    location.reload()
    document.getElementById("adminUsername").value = "";
    document.getElementById("adminPassword").value = "";

    if (adminInput === "adminadmin") {
        alert("Du är inloggad")
    } else {

        alert("Försök igen")
    }
})

if (localStorage.getItem("adminInput") === "adminadmin") {
    console.log("LS existerar och du är admin");

} else {
    console.log("skapar LS");
    localStorage.setItem("adminInput", "notAdmin")
    adminRightsElements.forEach(element => element.remove());
}

document.getElementById("clearLocalStorage").addEventListener("click", () => {
    localStorage.setItem("adminInput", "notAdmin")
    location.reload()

})

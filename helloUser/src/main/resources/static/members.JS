let adminRights = document.getElementsByClassName("adminRights");
let adminRightsElements = Array.from(adminRights);

if (localStorage.getItem("adminInput") === "adminadmin") {
    console.log("LS existerar och du är admin");

} else {
    console.log("skapar LS");
    localStorage.setItem("adminInput", "notAdmin")
    adminRightsElements.forEach(element => element.remove());
}
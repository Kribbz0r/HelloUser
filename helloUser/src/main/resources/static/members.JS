let adminRights = document.getElementsByClassName("adminRights");
let adminRightsElements = Array.from(adminRights);

if (localStorage.getItem("adminInput") === "adminadmin") {
    console.log("LS existerar och du är admin");

} else {
    localStorage.setItem("adminInput", "notAdmin")
    adminRightsElements.forEach(element => element.remove());
}
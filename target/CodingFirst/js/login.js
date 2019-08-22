function func1(name) {
    if (name == "span1") {
        document.getElementById("companyPhone").value = "";
        document.getElementById("companyPassword").value = "";
        document.getElementById("form2span1").style.display = "none";
        document.getElementById("form2span2").style.display = "none";

        document.getElementById("span1").style.color = "#1eb37b";
        document.getElementById("span2").style.color = "#969696";
        document.getElementById("img1").style.left = "20%";
        document.getElementById("form1").style.visibility = "visible";
        document.getElementById("form2").style.visibility = "hidden";
        document.getElementById("perImage").style.visibility = "hidden";

    }
    if (name == "span2") {
        document.getElementById("userPhone").value = "";
        document.getElementById("userPassword").value = "";
        document.getElementById("form1span1").style.display = "none";
        document.getElementById("form1span2").style.display = "none";

        document.getElementById("span1").style.color = "#969696";
        document.getElementById("span2").style.color = "#1eb37b";
        document.getElementById("img1").style.left = "50%";
        document.getElementById("form2").style.visibility = "visible";
        document.getElementById("form1").style.visibility = "hidden";
        document.getElementById("perImage").style.visibility = "visible";

    }

}
function func2(){
    var userPhone = document.getElementById("userPhone");
    if(userPhone.value != ""){
        document.getElementById("form1span1").style.display = "none";
    }

    if(userPhone.value == ""){
        document.getElementById("form1span1").style.display = "inline";
    }

}
function func3(){
    var userPassword = document.getElementById("userPassword");

    if(userPassword.value != ""){
        document.getElementById("form1span2").style.display = "none";
    }

    if(userPassword.value == ""){
        document.getElementById("form1span2").style.display = "inline";
    }
}
function func4(){
    var companyPhone = document.getElementById("companyPhone");

    if(companyPhone.value != ""){
        document.getElementById("form2span1").style.display = "none";
    }

    if(companyPhone.value == ""){
        document.getElementById("form2span1").style.display = "inline";
    }
}
function func5(){
    var companyName = document.getElementById("companyName");

    if(companyName.value != ""){
        document.getElementById("form2span3").style.display = "none";
    }

    if(companyName.value == ""){
        document.getElementById("form2span3").style.display = "inline";
    }
}
function func6(){
    var companyPassword = document.getElementById("companyPassword");

    if(companyPassword.value != ""){
        document.getElementById("form2span2").style.display = "none";
    }

    if(companyPassword.value == ""){
        document.getElementById("form2span2").style.display = "inline";
    }
}

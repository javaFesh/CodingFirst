
function func2(){
    var userPhone = document.getElementById("userPhone");
    var flag = false;
    var myPattern = /^1\d{10}$/ ;
    if(myPattern.test(userPhone.value)){
        document.getElementById("form1span1").style.display = "none";
        flag = true;
    }

    if(!myPattern.test(userPhone.value)){
        document.getElementById("form1span1").style.display = "inline";
        flag = false;
    }
    return flag;
}
function func3(){
    var userPassword = document.getElementById("userPassword");
    var flag = false;
    if(userPassword.value != "" && userPassword.value.length >= 6 && userPassword.value.length <= 10){
        document.getElementById("form1span2").style.display = "none";
        flag = true;
    }

    if(userPassword.value == "" || userPassword.value.length < 6 || userPassword.value.length > 10){
        document.getElementById("form1span2").style.display = "inline";
        flag = false;
    }
    return flag;
}
function func4(){
    var companyPhone = document.getElementById("companyPhone");
    var flag = false;
    var myPattern = /^1\d{10}$/ ;
    if(myPattern.test(companyPhone.value)){
        document.getElementById("form2span1").style.display = "none";
        flag = true;
    }

    if(!myPattern.test(companyPhone.value)){
        document.getElementById("form2span1").style.display = "inline";
        flag = false;
    }
    return flag;
}
function func5(){
    var companyName = document.getElementById("companyName");
    var flag = false;
    if(companyName.value != ""){
        document.getElementById("form2span3").style.display = "none";
        flag = true;
    }

    if(companyName.value == ""){
        document.getElementById("form2span3").style.display = "inline";
        flag = false;
    }
    return flag;
}
function func6(){
    var companyPassword = document.getElementById("companyPassword");
    var flag = false;
    if(companyPassword.value != "" && companyPassword.value.length >= 6 && companyPassword.value.length <= 10){
        document.getElementById("form2span2").style.display = "none";
        flag = true;
    }

    if(companyPassword.value == "" || companyPassword.value.length < 6 || companyPassword.value.length > 10){
        document.getElementById("form2span2").style.display = "inline";
        flag = false;
    }
    return flag;
}

function func7(){
    var userEmail = document.getElementById("userEmail");
    var flag = false;
    if(userEmail.value != ""){
        document.getElementById("form2span4").style.display = "none";
        flag = true;
    }

    if(userEmail.value == ""){
        document.getElementById("form2span4").style.display = "inline";
        flag = false;
    }
    document.getElementById("divforemail").style.visibility = "hidden";
    return flag;
}

function func8(){
    var companyAddress = document.getElementById("companyAddress");
    var flag = false;
    if(companyAddress.value != ""){
        document.getElementById("form2span5").style.display = "none";
        flag = true;
    }

    if(companyAddress.value == ""){
        document.getElementById("form2span5").style.display = "inline";
        flag = false;
    }
    return flag;
}

function func9(){
    var companyDescribe = document.getElementById("companyDescribe");
    var flag = false;
    if(companyDescribe.value != ""){
        document.getElementById("form2span6").style.display = "none";
        flag = true;
    }

    if(companyDescribe.value == ""){
        document.getElementById("form2span6").style.display = "inline";
        flag = false;
    }
    return flag;
}

function check1() {
    var a = func2();
    var b = func3();
    if (a == true && b == true) {
        return true;
    }
    else {
        return false;
    }
}
function check2() {
    var a = func4();
    var b = func5();
    var c = func6();
    var d = func4();
    var e = func5();
    var f = func6();
    if (a == true && b == true && c == true && d == true && e == true && f == true) {
        return true;
    }
    else {
        return false;
    }
}

function despan() {
    document.getElementById("form2span1").style.display = "none";
    document.getElementById("form2span2").style.display = "none";
    document.getElementById("form2span3").style.display = "none";
    document.getElementById("form2span4").style.display = "none";
    document.getElementById("form2span5").style.display = "none";
    document.getElementById("form2span6").style.display = "none";
}

function myonEmail() {
    document.getElementById("divforemail").style.visibility = "visible";
    var email = document.getElementById("userEmail");
    document.getElementById("span3").innerHTML = email.value;
    document.getElementById("span4").innerHTML = email.value;
    document.getElementById("span5").innerHTML = email.value;
    document.getElementById("span6").innerHTML = email.value;
    document.getElementById("span7").innerHTML = email.value;
    document.getElementById("span8").innerHTML = email.value;
    document.getElementById("span9").innerHTML = email.value;
    if (document.getElementById("userEmail").value == "") {
        document.getElementById("divforemail").style.visibility = "hidden";
    }
}

function insertspan(name) {
    document.getElementById("userEmail").value = document.getElementById("userEmail").value.split("@")[0] + name;
}

function insertspan2(name) {
    document.getElementById("userEmail").value = document.getElementById("userEmail").value.split("@")[0]+name;
}

// function insertspan1() {
//     var email = document.getElementById("companyEmail");
//     var a = document.getElementById("companyEmail").value.split("@");
//     email.value = a[0];
// }
function okvalue(name) {
    document.getElementById("userEmail").value = document.getElementById("userEmail").value;
}
function disdiv() {
    document.getElementById("divforemail").style.visibility = "hidden";
}



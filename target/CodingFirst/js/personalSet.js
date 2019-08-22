function setPassword() {
    var a = document.getElementById("p1");
    var b = document.getElementById("p2");
    var c = document.getElementById("p3");
    var flag = false;
    // if (a.value == "" || a.value == null) {
    //     flag = false;
    // }
    // if (b.value == "" || b.value == null) {
    //     flag = false;
    // }
    // if (c.value == "" || c.value == null) {
    //     flag = false;
    // }
    // if (c.value != b.value) {
    //     flag = false
    // }
    if (a.value != "" && b.value != "" && c.value != "" && b.value == c.value) {
        flag = true;
    }
    else if (b.value != c.value) {
        flag = false;
        alert("两次输入的新密码不一致");
    }
    else {
        flag = false;
    }
    return flag;
}

function trand(name) {
    var t = document.getElementById(name);
    t.type = "text";
}

function tranu(name) {
    var t = document.getElementById(name);
    t.type = "password";
}
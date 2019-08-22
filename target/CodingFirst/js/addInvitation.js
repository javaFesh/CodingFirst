function checkInsert() {
    if (addInvitation.invitationTitle.value == "" || addInvitation.invitationTitle.value== null) {
        alert("请输入文章标题！");
        addInvitation.invitationTitle.focus();
        return false;
    }else if (addInvitation.invitationType2.value == null || addInvitation.invitationType.value== null) {
        alert("请输入文章类型！");

        return false;
    }
    else return true;
}
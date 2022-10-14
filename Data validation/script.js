function formvalidation()
{
    var uid = document.form1.userid;
    var passid = document.form1.passid;
    if(userid_validation(uid, 5, 12))
    {
        if(passid_validation(passid, 7, 12))
        {
        }
    }
    return false;
}
function userid_validation(uid, mx, my)
{
    var ulen = uid.value.length;
    if(ulen==0 || ulen>=my || ulen < mx)
    {
        alert("user id should not be empty / length between "+mx+" to "+my);
        uid.focus();
        return false;
    }
    return true;
}
function passid_validation(passid, mx, my)
{
    var plen = passid.value.length;
    if(plen==0 || plen>=my || plen < mx)
    {
        alert("Password should not be empty / length between "+mx+" to "+my);
        passid.focus();
        return false;
    }
    else {
        alert("Form Successfully Submited");
        return true;
    }
}
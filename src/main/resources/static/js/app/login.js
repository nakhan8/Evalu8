 document.getElementById("errorMessage").style.display="none";  
     function validateLogin(){
       userName = document.getElementById("userName").value;
       dob  = document.getElementById("dob").value;
     
       jsonWrapper ={};
       var loginJson = {};
       loginJson["username"] = userName;
       loginJson["dob"] = dob;
       jsonWrapper["login"] = loginJson;
       console.log(jsonWrapper);
     
     
     
     }
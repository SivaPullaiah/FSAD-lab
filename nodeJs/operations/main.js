var http = require('http');
var clac = require('./operations');
var x=50, y=30;
http.createServer(function(req,res) {
    res.writeHead(200, {'Content-Type':'text/html'});
    res.write("<b>Addition is: "+clac.add(x,y)+"<br>");
    res.write("<b>Subtraction is: "+clac.sub(x,y)+"<br>");
    res.write("<b>Multiplicaton is: "+clac.mul(x,y)+"<br>");
    res.write("<b>Division is: "+clac.div(x,y)+"<br>");
    res.end();
}).listen(8081);
console.log("Server strted at 127.0.0.1:8081/");
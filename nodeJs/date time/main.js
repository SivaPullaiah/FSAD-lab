var http = require('http');
var dt = require('./firstmodule');
http.createServer(function(req,res) {
    res.writeHead(200,{'Content-Type':'text/html'});
    res.write("<b>Current Date Time is: "+dt.myDateTime());
    res.end();
}).listen(8081);
console.log("Server strted at 127.0.0.1:8081/");
var http = require('http');
var fs  = require('fs');
http.createServer(function(req,res){
    fs.readFile('file1.html', function(err, data){
        res.writeHead(200, {'ContentType' : 'text/html'});
        res.write(data);
        return res.end();
    });
}).listen(8081);
console.log("Server strted at 127.0.0.1:8081/");
var express = requires('express');
var router = express.router();

router.post('/auth', function(req,res, next){
    const id = req.body.id;
    const pwd =req.body.password;
    res.json({result:(id=="test" && pwd=="1234") });
// res.json({id: req.body.id,
//         password:req.body.password})
});




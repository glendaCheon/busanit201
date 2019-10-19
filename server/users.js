var express = requires('express');
var router = express.router();

router.post('/auth', function(req,res, next){
res.json({id: req.body.id,
        password:req.body.password})
});


var dict = {};

setInterval(function() {
    $.ajax({
        url: "list",
        context: document.body,
        success: function(data){
            dict = JSON.parse(data);
        }
    });
}, 5000);


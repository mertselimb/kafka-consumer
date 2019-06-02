x = [];
y = [];
oldCounts = [];
setInterval(function() {
    $.ajax({
        url: "list",
        context: document.body,
        success: function(data){
            dict = JSON.parse(data);
            x = dict.arr.map(d => new Date(d[1].replace(/-/g, ' ').substring(0, d[1].length - 4)))
            y = dict.arr.map(d => d[0])
            counts = {};
            for (var i = 0; i < y.length; i++) {
                counts[y[i]] = 1 + (counts[y[i]] || 0);
            }
            if(counts !== oldCounts){
                countsObj = Object.keys(counts).map(key => {return {"label": key , "y": counts[key]}})
                var chart = new CanvasJS.Chart("chart", {
                    theme: "dark1",
                    animationEnabled: false,
                    title:{
                        text: "Dashboard (real-time)"
                    },
                    data: [
                        {
                            type: "pie",
                            dataPoints: countsObj
                        }
                    ]
                });
                chart.render();
                var chart1 = new CanvasJS.Chart("chart1", {
                    theme: "dark1",
                    animationEnabled: false,
                    title:{
                        text: ""
                    },
                    data: [
                        {
                            type: "column",
                            dataPoints: countsObj
                        }
                    ]
                });
                chart1.render();
                oldCounts = counts;
            }

        }
    });
}, 500);


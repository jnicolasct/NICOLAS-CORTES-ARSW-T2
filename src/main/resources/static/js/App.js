var logica = (function () {
    
    var init = function(){
        
        apic.getAllCases();
    }
    /*var maper = function (bp) {
        var lista = bp.map(function (nbp) {
            return{name: nbp.name, points: nbp.points.length};
        });

        var suma = lista.reduce(function (total, current) {
            return total + current.points;
        }, 0);
        
        $("#tabla").empty();
        lista.map(function (blueprint) {
            $("#tabla").append(
                    "<tr> <td>" +
                    blueprint.name +
                    "</td> <td>" +
                    blueprint.points +
                    //"</td> <td><form><button type='button' onclick='logica.printCanvas( \'' +nameAuthor +'' , '' +blueprint.name +'\')' >Open</button></form></td>"
                    "</td> <td><form><button type='button' onclick='logica.printCanvas( \"" +Nauthor +'" , "' +blueprint.name +"\")' >Open</button></form></td>"

                    );
        });

    };*/
    return{   
        init:init,
    }
})();

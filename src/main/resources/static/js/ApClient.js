Url = "/stats"
var apic = (function () {
     return{
        getAllCases:function () {
            $.ajax({
                dataType: "json",
                url:Url
            });
        },getCoronaPais:function (name) {
            $.ajax({
                dataType: "json",
                url:Url+name
            });
        }
    };
})();
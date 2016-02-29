(function(angular) {
    //routing
    var routes = angular.module("frictionless.app.routes", ["ui.router"]);

    var configuration = function ($stateProvider, $urlRouterProvider) {

        $stateProvider.state("home", {
            url: "/",
            templateUrl : "home.html",
            controller : "homeCtrl"
        });

        $urlRouterProvider.otherwise("/");
    };

    routes.config(configuration);

    configuration.$inject = ["$stateProvider", "$urlRouterProvider"];

})(angular);
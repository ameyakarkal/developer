(function(angular) {

    var homeCtrl = function($scope) {
        $scope.Date = new Date();
    };

    angular.module("frictionless.app")
        .controller("homeCtrl", ["$scope", homeCtrl]);
})(angular);
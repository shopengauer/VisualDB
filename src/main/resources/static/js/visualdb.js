/**
 * Created by Василий on 12.07.2015.
 */

var mainModule = angular.module("VisualDB",[ 'ngRoute' ]);

//mainModule.controller("loginController",function($scope,$http){
//    $http.get('/resource/').success(function(data) {
//        $scope.greeting = data;
//    })
//});

mainModule.config(function($routeProvider,$httpProvider){
    $routeProvider.when('/', {
        templateUrl : 'home.html',
        controller : 'loginController'
    }).when('/login', {
        templateUrl : 'login.html',
        controller : 'navigation'
    }).otherwise('/');

    $httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';
}).controller("loginController",function($scope,$http){
    $http.get('/resource/').success(function(data) {
        $scope.greeting = data;
    })
});
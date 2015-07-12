/**
 * Created by Василий on 12.07.2015.
 */

var mainModule = angular.module("VisualDB",[ 'ngRoute' ]);

mainModule.controller("loginController",function($scope,$http){
    $http.get('/resource/').success(function(data) {
        $scope.greeting = data;
    })
});


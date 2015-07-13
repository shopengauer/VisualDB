/**
 * Created by Vasiliy on 13.07.2015.
 */

angular.module("VisualDB").constant("activeListTypeClass","btn-primary").controller("deviceListCtrl",function($scope,$filter,activeListTypeClass){

    var selectedType = null;

    $scope.selectType = function(newType){
        selectedType = newType;
    }

    $scope.typeFilterFn = function(device){
           return selectedType == null || device.devicetype == selectedType;

    }


    $scope.getTypeClass= function(type){
        return selectedType == type ? activeListTypeClass : "";
    }

})

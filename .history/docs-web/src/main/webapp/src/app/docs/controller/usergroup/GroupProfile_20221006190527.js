'use strict';

/**
 * Group profile controller.
 */
angular.module('docs').controller('GroupProfile', function($stateParams, Restangular, $scope) {
  $scope.averageGPA = 0;


  // Load user
  Restangular.one('group', $stateParams.name).get().then(function(data) {
    $scope.group = data;

    

  });
});
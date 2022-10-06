'use strict';

/**
 * User profile controller.
 */
angular.module('docs').controller('UserProfile', function($stateParams, Restangular, $scope) {
  // define scope variables
  $scope.userGPA = 0;
  $scope.skills = "";
  $scope.otherInfo = "";


  // Load user
  Restangular.one('user', $stateParams.username).get().then(function(data) {
    $scope.user = data;
  });
});
'use strict';

/**
 * User profile controller.
 */
angular.module('docs').controller('UserProfile', function($stateParams, Restangular, $scope) {
  

  // Load user
  Restangular.one('user', $stateParams.username).get().then(function(data) {
    $scope.user = data;

    $scope.userGPA = data.gpa;
    $scope.skills = data.skills;
    $scope.otherinfo = data.otherInfo;
  });
});
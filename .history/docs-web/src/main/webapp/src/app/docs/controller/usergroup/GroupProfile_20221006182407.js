'use strict';

/**
 * Group profile controller.
 */
angular.module('docs').controller('GroupProfile', function($stateParams, Restangular, $scope) {
  $scope.averageGPA = 0;


  // Load user
  Restangular.one('group', $stateParams.name).get().then(function(data) {
    $scope.group = data;

    $scope.groupMembersGPA = users.map(myFunction)

    function myFunction(user) {
      return user.gpa;
    }

    $scope.averageGPA = groupMembersGPA.reduce(add, 0);
    function add(accumulator, a) {
      return accumulator + a;
    }

  });
});
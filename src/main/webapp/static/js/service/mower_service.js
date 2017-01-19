'use strict';

angular.module('myApp').factory('MowerService', ['$http', '$q', function($http, $q){

    var REST_SERVICE_URI = 'http://localhost:8080/SpringMVCAngularJS/mowers/';

    var factory = {
    		fetchAllMowers: fetchAllMowers
    };

    return factory;

    function fetchAllMowers() {
        var deferred = $q.defer();
        $http.get(REST_SERVICE_URI)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Error while fetching Mowers');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }

}]);

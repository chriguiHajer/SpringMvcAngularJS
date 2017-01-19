'use strict';

angular.module('myApp').controller('MowerController',
		[ '$scope', 'MowerService', function($scope, MowerService) {
			var self = this;
			
			self.mower = {
				id : null
			};
			
			self.mowers = [];

			fetchAllMowers();

			function fetchAllMowers() {
				MowerService.fetchAllMowers().then(function(d) {
					self.mowers = d;
				}, function(errResponse) {
					console.error('Error while fetching Mowers');
				});
			}
		} ]);

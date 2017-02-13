/**
 * Script en el cual se desarrola la logica del negocio usando angularjs
 * autor:Alejandro Isaza Delgado - alejandro.isazad@udea.edu.co

 */

var modulo = angular.module('app',['ui.router','ngPagination']);


modulo.config(function($stateProvider, $urlRouterProvider){
	
	$stateProvider
	.state('home',{
		url: '/home',
		templateUrl: '../resources/views/home.html',
		controller: 'HomeController',
		controllerAs : 'home'
	})
	


	$urlRouterProvider.otherwise('/home');
});


    

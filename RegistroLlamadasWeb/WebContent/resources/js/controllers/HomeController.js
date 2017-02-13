/**
 * Script en el cual se desarrola la logica del negocio usando angularjs
 * autor:Alejandro Isaza Delgado - alejandro.isazad@udea.edu.co

 */

var modulo = angular.module('app');

modulo.controller('HomeController', ['$scope','reporte', function($scope,reporte) {
     
		$scope.lista = [
			
//			{
//		        id: 1,
//		        primernombre: 'Juan',
//		        segundonombre: 'Mario',
//		        primerapellido: 'Pérez',
//		        segundoapellido: 'Maldonado',
//		        fechanacimiento: '23-12-1985'
//		      }, {
//		        id: 2,
//		        primernombre: 'Jorge',
//		        segundonombre: 'Alfonzo',
//		        primerapellido: 'Quinto',
//		        segundoapellido: 'Marroquín',
//		        fechanacimiento: '15-01-1988'
//		      }, {
//		        id: 3,
//		        primernombre: 'Carlos',
//		        segundonombre: 'Alberto',
//		        primerapellido: 'Vargas',
//		        segundoapellido: 'Martínez',
//		        fechanacimiento: '09-03-1990'
//		      }, {
//		        id: 4,
//		        primernombre: 'Mario',
//		        segundonombre: 'Alvaro',
//		        primerapellido: 'Hernadez',
//		        segundoapellido: 'Morales',
//		        fechanacimiento: '23-02-1984'
//		      }, {
//		        id: 5,
//		        primernombre: 'Marlon',
//		        segundonombre: 'Federico',
//		        primerapellido: 'López',
//		        segundoapellido: 'Padilla',
//		        fechanacimiento: '01-03-1976'
//		      }, {
//		        id: 6,
//		        primernombre: 'Daniel',
//		        segundonombre: 'Francisco',
//		        primerapellido: 'Herrera',
//		        segundoapellido: 'Perdomo',
//		        fechanacimiento: '22-03-1989'
//		      }, {
//		        id: 7,
//		        primernombre: 'Cesar',
//		        segundonombre: 'Jaime',
//		        primerapellido: 'Arroche',
//		        segundoapellido: 'Pedrosa',
//		        fechanacimiento: '18-02-1987'
//		      }, {
//		        id: 8,
//		        primernombre: 'Julio',
//		        segundonombre: 'Ignacio',
//		        primerapellido: 'Carvajal',
//		        segundoapellido: 'Quevedo',
//		        fechanacimiento: '16-10-1988'
//		      }, {
//		        id: 9,
//		        primernombre: 'Carla',
//		        segundonombre: 'Daniela',
//		        primerapellido: 'Molino',
//		        segundoapellido: 'Díaz',
//		        fechanacimiento: '01-11-1988'
//		      }, {
//		        id: 10,
//		        primernombre: 'Daniela',
//		        segundonombre: 'Flor',
//		        primerapellido: 'Palma',
//		        segundoapellido: 'Gabiño',
//		        fechanacimiento: '23-08-1990'
//		      }, {
//		        id: 11,
//		        primernombre: 'Maritza',
//		        segundonombre: 'Gabriela',
//		        primerapellido: 'Quiñonez',
//		        segundoapellido: 'Gómez',
//		        fechanacimiento: '31-09-1987'
//		      }, {
//		        id: 12,
//		        primernombre: 'Aaron',
//		        segundonombre: 'Bernando',
//		        primerapellido: 'Salvatierra',
//		        segundoapellido: 'Gonzalez',
//		        fechanacimiento: '05-10-1990'
//		      }, {
//		        id: 13,
//		        primernombre: 'Adrian',
//		        segundonombre: 'Ignacio',
//		        primerapellido: 'Alvarez',
//		        segundoapellido: 'Villagran',
//		        fechanacimiento: '04-11-1987'
//		      }, {
//		        id: 14,
//		        primernombre: 'Bernardo',
//		        segundonombre: 'Javier',
//		        primerapellido: 'Alfaro',
//		        segundoapellido: 'Valdez',
//		        fechanacimiento: '06-12-1977'
//		      }
			
		];
		
		$scope.currentPage = 0;
		$scope.pageSize = 10;
		$scope.pages = [];

		reporte.getReports().then(function (data){
			$scope.listaData = data.data.Registro;
			for(i=0;i<$scope.listaData.length;i++){
				var objetoData = $scope.listaData[i];
				var objeto = {
						id : objetoData.id,
						fecha: objetoData.fecha,
						pais: objetoData.pais.nombre,
						colaborador: objetoData.colaborador.nombre,
						motivo:objetoData.motivo.nombre,
						comentario: objetoData.comentario,
						terminadaPor: objetoData.terminadaPor
				}
				 $scope.lista.push(objeto);
			}
			console.log($scope.lista);
	});	
		
		 $scope.configPages = function() {
		        $scope.pages.length = 0;
		        var ini = $scope.currentPage - 4;
		        var fin = $scope.currentPage + 5;
		        if (ini < 1) {
		          ini = 1;
		          if (Math.ceil($scope.lista.length / $scope.pageSize) > 10)
		            fin = 10;
		          else
		            fin = Math.ceil($scope.lista.length / $scope.pageSize);
		        } else {
		          if (ini >= Math.ceil($scope.lista.length / $scope.pageSize) - 10) {
		            ini = Math.ceil($scope.lista.length / $scope.pageSize) - 10;
		            fin = Math.ceil($scope.lista.length / $scope.pageSize);
		          }
		        }
		        if (ini < 1) ini = 1;
		        for (var i = ini; i <= fin; i++) {
		          $scope.pages.push({
		            no: i
		          });
		        }

		        if ($scope.currentPage >= $scope.pages.length)
		          $scope.currentPage = $scope.pages.length - 1;
		      };

		      $scope.setPage = function(index) {
		        $scope.currentPage = index - 1;
		      };
		    

}]);


modulo.filter('startFromGrid', function() {
	  return function(input, start) {
		    start = +start;
		    return input.slice(start);
		  }
		});




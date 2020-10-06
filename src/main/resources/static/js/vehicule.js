

$(document).ready(function(){

	$('table #edit_con').on('click',function(event){
		event.preventDefault();
		
		// /contry/findById/?id=2
		var href = $(this).attr('href');
		
		$.get(href, function(vm,status){
			$('#Id').val(vm.id);
			$('#vehiculeType').val(vm.vehiculetypeid);
			var dateAcquis = vm.acquisitionDate.substr(0,10);
			var dateRegis = vm.registrationDate.substr(0,10);
			$('#acquisitionDate').val(dateAcquis);
			$('#registrationDate').val(dateRegis);
			$('#Remarks').val(vm.remarks);
			$('#Location').val(vm.locationid);
			$('#vehiculeNumber').val(vm.vehiculeNumber);
			$('#Name').val(vm.name);
			$('#description').val(vm.description);
			$('#vehiculeMake').val(vehiculemakeid);
			$('#vehiculeModel').val(vehiculemodelid);
			$('#Power').val(vm.power);
			$('#Fuel').val(vm.fuelCapacity);
			$('#PoidsNet').val(vm.netWeight);
			$('#Employe').val(vm.employeid);
			$('#Status').val(vm.vehiculestatusid);
		});
		
		$('#editModal').modal();		
	});
	
	$('table #delete_con').on('click',function(event){
		event.preventDefault();
		
		 var href = $(this).attr('href');
		 
		 $('#confirmDelete').attr('href',href);
		
		$('#deleteModal').modal();
	});
	
});
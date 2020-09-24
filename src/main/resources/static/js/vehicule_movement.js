

$(document).ready(function(){

	$('table #edit_vm').on('click',function(event){
		event.preventDefault();
		
		// /contry/findById/?id=2
		var href = $(this).attr('href');
		
		$.get(href, function(vm,status){
			$('#Id').val(vm.id);
			$('#Vehicule').val(vm.vehiculeid);
			var date1 = vm.date1.substr(0,10);
			var date2 = vm.date2.substr(0,10);
			$('#Date1').val(date1);
			$('#Date2').val(date2);
			$('#Remarks').val(vm.remarks);
			$('#Location1').val(vm.location1);
			$('#Location2').val(vm.location2);
		});
		
		$('#editModal').modal();		
	});
	
	$('table #delete_vm').on('click',function(event){
		event.preventDefault();
		
		 var href = $(this).attr('href');
		 
		 $('#confirmDelete').attr('href',href);
		
		$('#deleteModal').modal();
	});
	
});
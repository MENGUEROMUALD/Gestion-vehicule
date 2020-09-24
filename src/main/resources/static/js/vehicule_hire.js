

$(document).ready(function(){

	$('table #edit_vm').on('click',function(event){
		event.preventDefault();
		
		// /contry/findById/?id=2
		var href = $(this).attr('href');
		
		$.get(href, function(vm,status){
			$('#Id').val(vm.id);
			$('#Vehicule').val(vm.vehiculeid);
			var dateOut = vm.dateOut.substr(0,10);
			var dateIn = vm.dateIn.substr(0,10);
			$('#DateOut').val(dateOut);
			$('#DateIn').val(dateIn);
			$('#Remarks').val(vm.remarks);
			$('#Location').val(vm.locationid);
			$('#TimeOut').val(vm.timeOut);
			$('#TimeIn').val(vm.timeIn);
			$('#Price').val(vm.price);
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
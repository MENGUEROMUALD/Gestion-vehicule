

$(document).ready(function(){

	$('table #edit_vm').on('click',function(event){
		event.preventDefault();
		
		// /contry/findById/?id=2
		var href = $(this).attr('href');
		
		$.get(href, function(vm,status){
			$('#Id').val(vm.id);
			$('#Vehicule').val(vm.vehiculeid);
			var startDate = vm.startDate.substr(0,10);
			var endDate = vm.endDate.substr(0,10);
			$('#startDate').val(startDate);
			$('#endDate').val(endDate);
			$('#Remarks').val(vm.remarks);
			$('#Supplier').val(vm.supplierid);
			$('#Price').val(vm.price);
		});
		
		$('#editmodal').modal();		
	});
	
	$('table #delete_vm').on('click',function(event){
		event.preventDefault();
		
		 var href = $(this).attr('href');
		 
		 $('#confirmDelete').attr('href',href);
		
		$('#deleteModal').modal();
	});
	
});


$(document).ready(function(){

	$('table #edit_supp').on('click',function(event){
		event.preventDefault();
		
		// /contry/findById/?id=2
		var href = $(this).attr('href');
		
		$.get(href, function(vm,status){
			$('#Id').val(vm.id);
			$('#Title').val(vm.title);
			var dateHire = vm.datehire.substr(0,10);
			var dateBorth = vm.dateOfBirth.substr(0,10);
			$('#datehire').val(dateHire);
			$('#dateOfBirth').val(dateBorth);
			$('#Initials').val(vm.initials);
			$('#socialSecurityNumber').val(vm.socialSecurityNumber);
			$('#firstname').val(vm.firstname);
			$('#lastname').val(vm.lastname);
			$('#orthername').val(vm.orthername);
			$('#Gender').val(vm.gender);
			$('#contryid').val(vm.contryid);
			$('#adress').val(vm.address);
			$('#stateid').val(vm.stateid);
			$('#city').val(vm.city);
			$('#phone').val(vm.phone);
			$('#mobile').val(vm.mobile);
			$('#maritalStatus').val(vm.maritalStatus);
			$('#Email').val(vm.email);
			$('#jobtitleid').val(vm.jobtitleid);
			$('#employetypeid').val(vm.employetypeid);
		});
		
		$('#editModal').modal();		
	});
	
	$('table #delete_supp').on('click',function(event){
		event.preventDefault();
		
		 var href = $(this).attr('href');
		 
		 $('#confirmDelete').attr('href',href);
		
		$('#deleteModal').modal();
	});
	
	
	$('table #photoButton').on('click',function(event){
		event.preventDefault();
		var href = $(this).attr('href');
		$('#photoModal #employeePhoto').attr('src', href);
		$('#photoModal').modal();
	});
});
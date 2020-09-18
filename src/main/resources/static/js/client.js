

$(document).ready(function(){

	$('table #edit_cl').on('click',function(event){
		event.preventDefault();
		
		// /client/findById/?id=2
		var href = $(this).attr('href');
		
		$.get(href, function(client,status){
			$('#id').val(client.id);
			$('#Nom').val(client.name);
			$('#Detail').val(client.details);
			$('#Site').val(client.website);
			$('#Adress').val(client.address);
			$('#State').val(client.stateid);
			$('#Contry').val(client.contryid);
			$('#City').val(client.city);
			$('#Phone').val(client.phone);
			$('#Mobile').val(client.mobile);
			$('#Email').val(client.email);
		});
		
		$('#editModal').modal();		
	});
	
	$('table #delete_cl').on('click',function(event){
		event.preventDefault();
		
		 var href = $(this).attr('href');
		 
		 $('#confirmDelete').attr('href',href);
		
		$('#deleteModal').modal();
	});
	
});


$(document).ready(function(){

	$('table #edit_contry').on('click',function(event){
		event.preventDefault();
		
		// /contry/findById/?id=2
		var href = $(this).attr('href');
		
		$.get(href, function(contry,status){
			$('#idEdit').val(contry.id);
			$('#decription_edit').val(contry.description);
			$('#capital_edit').val(contry.capital);
			$('#nationality_edit').val(contry.natinality);
			$('#code_edit').val(contry.code);
			$('#continent_edit').val(contry.continent);
		});
		
		$('#editmodal').modal();		
	});
	
	$('table #delete_contry').on('click',function(event){
		event.preventDefault();
		
		 var href = $(this).attr('href');
		 
		 $('#confirmDelete').attr('href',href);
		
		$('#deleteContry').modal();
	});
	
});
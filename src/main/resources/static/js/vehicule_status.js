$(document).ready(function(){
	
	// start button edit
	$('table #edit_sv').on('click',function(event){
		event.preventDefault();
		
		var href = $(this).attr('href');//prend l'attribu du lien cad : vehicule_status/findById/?id=numero de l'id
		$.get(href,function(data,status){
			$('#id').val(data.id);
			$('#description').val(data.description);
			$('#detail').val(data.detail);
		});
		
		$('#editModal').modal();
	});
	// end button edit
	
	// start button delete
	$('table #delete_sv').on('click',function(event){
		event.preventDefault();
		
		var href = $(this).attr('href');
		$('#confirmDelete').attr('href',href);
		$('#deleteVm').modal();
	});
	// end button delete
});
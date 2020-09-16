$(document).ready(function(){
	
	// start edit button
	$('table #edit_vm').on('click',function(event){
		event.preventDefault();
		
		var href = $(this).attr('href');
		$.get(href,function(data,status){
			$('#id').val(data.id);
			$('#description').val(data.description);
			$('#detail').val(data.detail);
		});
		$('#editModal').modal();
	});
	// end edit button
	
	// start delete button
	$('table #delete_vm').on('click',function(event){
		event.preventDefault();
		
		var href = $(this).attr('href');
		$('#confirmDelete').attr('href',href);
		$('#deleteVm').modal();
	});
	// end delete button
});
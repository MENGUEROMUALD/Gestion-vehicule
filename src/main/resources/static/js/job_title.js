$(document).ready(function(){
	
	// start edit button
	$('table #edit_jt').on('click',function(e){
		e.preventDefault();
		
		var href = $(this).attr('href');
		
		$.get(href, function(data, status){
			$('#id').val(data.id);
			$('#description').val(data.description);
			$('#detail').val(data.detail);
		});
		$('#editModal').modal();
	});
	// end edit button
	
	// start delete button
	$('table #delete_jt').on('click', function(e){
		e.preventDefault();
		
		var href = $(this).attr('href');
		$('#confirmDelete').attr('href', href);
		$('#deleteModal').modal();
	});
	// end delete button
});
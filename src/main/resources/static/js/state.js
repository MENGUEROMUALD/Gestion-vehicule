$(document).ready(function(){
	
	// start button edit state
		$('table #edit_state').on('click',function(event){
			event.preventDefault();
			
			var href = $(this).attr('href');
			$.get(href,function(state,status){
				$('#edit_id').val(state.id);
				$('#edit_code').val(state.code);
				$('#edit_capital').val(state.capital);
				$('#edit_description').val(state.name);
				$('#edit_details').val(state.details);
				$('#edit_contry').val(state.contryid);
			});
			$('#editModal').modal();
		});		
	// end button edit state
	
		
		// start button delete state
			$('table #delete_state').on('click',function(event){
				event.preventDefault();
				var href = $(this).attr('href');
				$('#confirmDelete').attr('href',href);
				$('#deleteState').modal();
			});
		// end button delete state
});
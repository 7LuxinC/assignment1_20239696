package info.scce.dime.process.dime__HYPHEN_MINUS__models.interaction;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Date;
import java.util.UUID;
import java.util.Optional;

import javax.enterprise.inject.spi.BeanManager;
import javax.inject.Inject;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

import info.scce.dime.exception.GUIEncounteredSignal;
import info.scce.dime.exception.GUIEncounteredSignal.GUIInfo;
import info.scce.dime.process.CallFrame;
import info.scce.dime.process.DIMEProcess;
import info.scce.dime.process.DIMEProcessContext;
import info.scce.dime.process.JSONContext;
import info.scce.dime.process.ProcessCallFrame;
import info.scce.dime.util.CDIUtil;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

public final class LibrarianMS_FtHjoU1xEeyjn6oaCYeN5A implements DIMEProcess {


	// attributes shaping the context variables.
	public static class Context implements DIMEProcessContext {

		// bean manager
		private BeanManager beanManager;
		
		// current eventID
		private String eventId;
		
		// last MajorSIBId
		private String lastMajorSIBId;
		
		// current MajorGUI
		private GUIInfo majorGUIState = null;

		// stack variables
		private ProcessCallFrame callStack = new ProcessCallFrame();


		public info.scce.dime.process.JSONContext toJSON() {
			// this process has no context variables that need to be preserved
			return null;
        }
	}

	private enum SIB_ID {
	_FukVIU1xEeyjn6oaCYeN5A,
	_LMIxEU1xEeyjn6oaCYeN5A,
	___HYPHEN_MINUS__BVuQE1xEeyjn6oaCYeN5A,
		;
	}

	private final BeanManager beanManager;

	@Inject
	public LibrarianMS_FtHjoU1xEeyjn6oaCYeN5A(final BeanManager beanManager) {
		this.beanManager = beanManager;
	}

	private Context createContext() {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		
		return ctx;
	}

	public LibrarianMS_FtHjoU1xEeyjn6oaCYeN5AResult execute(boolean isAuthenticationRequired) {
		final Context ctx = createContext();
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._LMIxEU1xEeyjn6oaCYeN5A);
	}
	
	
	public LibrarianMS_FtHjoU1xEeyjn6oaCYeN5AResult execute(ProcessCallFrame callStack) {
		final Context ctx = createContext();
		ctx.callStack = callStack;

		return executeInternal(ctx, SIB_ID._LMIxEU1xEeyjn6oaCYeN5A);
	}

	@Override
	public LibrarianMS_FtHjoU1xEeyjn6oaCYeN5AResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		assert context == null;
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;
		ctx.callStack = callStack;

		switch (sibId) {
		case "_LMIxEU1xEeyjn6oaCYeN5A": return executeInternal(ctx, continue_LMIxEU1xEeyjn6oaCYeN5A(ctx, slgResult));
		case "_-BVuQE1xEeyjn6oaCYeN5A": return executeInternal(ctx, continue___HYPHEN_MINUS__BVuQE1xEeyjn6oaCYeN5A(ctx, slgResult));
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private LibrarianMS_FtHjoU1xEeyjn6oaCYeN5AResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _FukVIU1xEeyjn6oaCYeN5A: {
					return execute_FukVIU1xEeyjn6oaCYeN5A(ctx);
				}
				case _LMIxEU1xEeyjn6oaCYeN5A: {
					curr = execute_LMIxEU1xEeyjn6oaCYeN5A(ctx);
					break;
				}
				case ___HYPHEN_MINUS__BVuQE1xEeyjn6oaCYeN5A: {
					curr = execute___HYPHEN_MINUS__BVuQE1xEeyjn6oaCYeN5A(ctx);
					break;
				}
				default: {
					throw new IllegalStateException("unhandled SIB container " + curr);
				}
			}
		}
	}
	
	/**
	 * The return type for this process. It stores the corresponding branch name 
	 * as well as the corresponding result for the branch.
	 */
	public static class LibrarianMS_FtHjoU1xEeyjn6oaCYeN5AResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public LibrarianMS_FtHjoU1xEeyjn6oaCYeN5AResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_FukVIU1xEeyjn6oaCYeN5A";
			this.success = success;
		}
		
		public String getBranchName() {
			return branchName;
		}
		
		public String getBranchId() {
			return branchId;
		}
		
		public SuccessReturn getSuccessReturn() {
			return success;
		}

	}
	
	// model branches.
		/**
		 * Interface definition for return type of branch <code>success</code>.
		 */
		public interface SuccessReturn {
		}
	
		/**
		 * Return type of branch <code>success</code> accessing the 
		 * corresponding values in the process context, instead of storing
		 * the values locally.
		 */
		static class SuccessReturnImpl implements SuccessReturn {

			private final Context ctx;

	        SuccessReturnImpl(Context ctx) {
	            this.ctx = ctx;
	        }

		}
		


	// sibs
	// container for graph i/o 'success'.
	public LibrarianMS_FtHjoU1xEeyjn6oaCYeN5AResult execute_FukVIU1xEeyjn6oaCYeN5A(final Context ctx) {
		return new LibrarianMS_FtHjoU1xEeyjn6oaCYeN5AResult(new SuccessReturnImpl(ctx));
	}
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB PublicHome _LMIxEU1xEeyjn6oaCYeN5A
	private static class InputsForGUISIB_LMIxEU1xEeyjn6oaCYeN5A {
	}
	
	
	// container for GUI SIB 'PublicHome'.
	public SIB_ID execute_LMIxEU1xEeyjn6oaCYeN5A(final Context ctx) {
	
		
		final InputsForGUISIB_LMIxEU1xEeyjn6oaCYeN5A inputs = new InputsForGUISIB_LMIxEU1xEeyjn6oaCYeN5A();
		
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.dime__HYPHEN_MINUS__models.interaction.LibrarianMS_FtHjoU1xEeyjn6oaCYeN5A:_LMIxEU1xEeyjn6oaCYeN5A:_LmrS0Ej8EeaK4_MRcoLfnw", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_LMIxEU1xEeyjn6oaCYeN5A", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue_LMIxEU1xEeyjn6oaCYeN5A(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_LMIxEU1xEeyjn6oaCYeN5A");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		final info.scce.dime.gui.dime__HYPHEN_MINUS__models.gui.publichome.PublicHome_LmrS0Ej8EeaK4_MRcoLfnwResult result = (info.scce.dime.gui.dime__HYPHEN_MINUS__models.gui.publichome.PublicHome_LmrS0Ej8EeaK4_MRcoLfnwResult) guiResult;
		if ("Login".equals(result.getBranchName())) {
			// branch 'Login'
			return SIB_ID.___HYPHEN_MINUS__BVuQE1xEeyjn6oaCYeN5A;
		}
		else {
			// unspecified branch, show same GUI again
			return execute_LMIxEU1xEeyjn6oaCYeN5A(ctx);
		}
	}
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB PrivateHome _-BVuQE1xEeyjn6oaCYeN5A
	private static class InputsForGUISIB___HYPHEN_MINUS__BVuQE1xEeyjn6oaCYeN5A {
	}
	
	
	// container for GUI SIB 'PrivateHome'.
	public SIB_ID execute___HYPHEN_MINUS__BVuQE1xEeyjn6oaCYeN5A(final Context ctx) {
	
		
		final InputsForGUISIB___HYPHEN_MINUS__BVuQE1xEeyjn6oaCYeN5A inputs = new InputsForGUISIB___HYPHEN_MINUS__BVuQE1xEeyjn6oaCYeN5A();
		
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.dime__HYPHEN_MINUS__models.interaction.LibrarianMS_FtHjoU1xEeyjn6oaCYeN5A:_-BVuQE1xEeyjn6oaCYeN5A:_NGHA8F4TEear0NzybbrMtw", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_-BVuQE1xEeyjn6oaCYeN5A", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue___HYPHEN_MINUS__BVuQE1xEeyjn6oaCYeN5A(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_-BVuQE1xEeyjn6oaCYeN5A");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		final info.scce.dime.gui.dime__HYPHEN_MINUS__models.gui.privatehome.PrivateHome_NGHA8F4TEear0NzybbrMtwResult result = (info.scce.dime.gui.dime__HYPHEN_MINUS__models.gui.privatehome.PrivateHome_NGHA8F4TEear0NzybbrMtwResult) guiResult;
		if ("LibrarianMS".equals(result.getBranchName())) {
			// branch 'LibrarianMS'
			return SIB_ID._FukVIU1xEeyjn6oaCYeN5A;
		}
		else {
			// unspecified branch, show same GUI again
			return execute___HYPHEN_MINUS__BVuQE1xEeyjn6oaCYeN5A(ctx);
		}
	}
	
}  
